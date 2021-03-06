package com.zd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shanghaizhida.beans.CommandCode;
import com.shanghaizhida.beans.MarketInfo;
import com.shanghaizhida.beans.NetInfo;
import com.zd.business.common.CommonUtils;
import com.zd.business.engine.main.market.MarketEventEngine;
import com.zd.business.engine.main.market.MarketEventHandler;
import com.zd.config.Global;

import io.netty.channel.ChannelHandlerContext;

@RestController
public class TestController {

	@GetMapping("test")
	public void test() {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					MarketEventEngine.addHandler();
					while (true) {
						MarketInfo mi = new MarketInfo();
						mi.code = Thread.currentThread().getName();
						mi.buyNumber = "" + Math.random() * 20;
						Global.marketEventProducer.onData(mi.MyToString());
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}).start();
		}

	}

	@GetMapping("send")
	public void send() throws Exception {
		ChannelHandlerContext ctx = Global.market01ChannelMap.get(Global.MARKET01SERVERCHANNELKEY);
		NetInfo ni = new NetInfo();
		ni.code = CommandCode.MARKET01;
		ni.todayCanUse = "++";
		// ni.systemCode = "1000";
		System.out.println("向服务端发送数据：" + CommonUtils.toCommandString(ni.MyToString()));
		ctx.channel().writeAndFlush(CommonUtils.toCommandString(ni.MyToString()));
	}

	@GetMapping("sub/{loopCount}/{symbols}")
	public void sub(@PathVariable Integer loopCount, @PathVariable String symbols) {
		for (int i = 0; i < loopCount; i++) {
			String[] split = symbols.split(",");
			MarketEventHandler handler = MarketEventEngine.addHandler();
			for (String s : split) {
				handler.subscribeEvent(s);
			}
		}

	}

	@GetMapping("pub/{symbols}")
	public void pub(@PathVariable String symbols) {
		String[] split = symbols.split(",");
		MarketInfo mi=new MarketInfo();
		for (String s : split) {
			mi.code=s;
			Global.marketEventProducer.onData(mi.MyToString());
		}
	}
}
