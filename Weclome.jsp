<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
  <div id="shortcut">
    <div class="w">
      <ul class="fl" clstag="h|keycount|2016|01a">
        <li class="dorpdown" id="ttbar-mycity"></li>
      </ul>

      <ul class="fr">
        <li class="fore1" id="ttbar-login" clstag="h|keycount|2016|01b">
          <a target="_blank" href="javascript:login();" class="link-login">你好，请登录</a>&nbsp;&nbsp;<a href="javascript:regist();" class="link-regist style-red">免费注册</a>
        </li>
        <li class="spacer"></li>
        <li class="fore2" clstag="h|keycount|2016|01c">
          <div class="dt"><a target="_blank" href="//order.jd.com/center/list.action">我的订单</a></div>
        </li>
        <li class="spacer"></li>
        <li class="fore3 dorpdown" id="ttbar-myjd" clstag="h|keycount|2016|01d">
          <div class="dt cw-icon"><a target="_blank" href="//home.jd.com/">我的京东</a><i class="iconfont">&#xe605;</i><i class="ci-right"><s>◇</s></i></div>
          <div class="dd dorpdown-layer"></div>
        </li>
        <li class="spacer"></li>
        <li class="fore4" clstag="h|keycount|2016|01e">
          <div class="dt"><a target="_blank" href="//vip.jd.com/">京东会员</a></div>
        </li>
        <li class="spacer"></li>
        <li class="fore5" clstag="h|keycount|2016|01f">
          <div class="dt"><a target="_blank" href="//b.jd.com/">企业采购</a></div>
        </li>
        <li class="spacer"></li>
        <li class="fore8 dorpdown" id="ttbar-serv" clstag="h|keycount|2016|01g">
          <div class="dt cw-icon">客户服务<i class="iconfont">&#xe605;</i><i class="ci-right"><s>◇</s></i></div>
          <div class="dd dorpdown-layer"></div>
        </li>
        <li class="spacer"></li>
        <li class="fore9 dorpdown" id="ttbar-navs" clstag="h|keycount|2016|01h">
          <div class="dt cw-icon">网站导航<i class="iconfont">&#xe605;</i><i class="ci-right"><s>◇</s></i></div>
          <div class="dd dorpdown-layer"></div>
        </li>
        <li class="spacer"></li>
        <li class="fore10 mobile" id="J_mobile" clstag="h|keycount|2016|01i">
        	<div class="dt mobile_txt">手机京东</div>
        		<div class="mobile_static">
                    <div class="mobile_static_qrcode"></div>
                </div>
        	<div id='J_mobile_pop' class='mod_loading mobile_pop'>
            </div>
        </li>
      </ul>
    </div>
  </div>

  <div id="header">
    <div class="w">
      <div id="logo" class="logo" clstag="h|keycount|2016|02a">
        <h1 class="logo_tit"><a href="//www.jd.com" class="logo_tit_lk">京东</a></h1>
        <h2 class="logo_subtit">京东,多快好省</h2>
        <div class="logo_extend"></div>
      </div>

      <div id="search">
        <div class="search-m">
          <div class="search_logo">
            <a href="//www.jd.com" class="search_logo_lk" clstag="h|keycount|2016|02b">京东，多快好省</a>
          </div>
          <ul id="shelper" style="display: none"></ul>

          <div class="form">
            <input clstag="h|keycount|2016|03a" type="text" onkeydown="javascript:if(event.keyCode==13) search('key');" autocomplete="off" id="key" accesskey="s" class="text" />
            <button clstag="h|keycount|2016|03c" onclick="search('key');return false;" class="button"><i class="iconfont">&#xe603;</i></button>
          </div>
        </div>
      </div>

      <div id="settleup" class="dorpdown" clstag="h|keycount|2016|04a">
        <div class="cw-icon">
          <i class="ci-left"></i>
          <i class="ci-right"></i>
          <i class="iconfont">&#xe607;</i>
          <a target="_blank" href="//cart.jd.com/cart.action">我的购物车</a>
        </div>
        <div class="dorpdown-layer">
          <div class="spacer"></div>
          <div id="settleup-content">
            <span class="loading"></span>
          </div>
        </div>
      </div>

      <div id="hotwords" clstag="h|keycount|2016|03b"></div>



        <div id="navitems">
		
		<ul id="navitems-group1">
			<li clstag="h|keycount|2016|05a" class="fore1" >
				<a target="_blank" href="//miaosha.jd.com/">秒杀</a>
			</li>
			<li clstag="h|keycount|2016|05b" class="fore2" >
				<a target="_blank" href="https://a.jd.com/">优惠券</a>
			</li>
			<li clstag="h|keycount|2016|05c" class="fore3" >
				<a target="_blank" href="//red.jd.com/">闪购</a>
			</li>
			<li clstag="h|keycount|2016|05d" class="fore4" >
				<a target="_blank" href="//paimai.jd.com/">拍卖</a>
			</li>
		</ul>
		<div class="spacer"></div>
		<ul id="navitems-group2">
			<li clstag="h|keycount|2016|05e" class="fore1" >
				<a target="_blank" href="https://channel.jd.com/fashion.html ">服装城</a>
			</li>
			<li clstag="h|keycount|2016|05f" class="fore2" >
				<a target="_blank" href="//chaoshi.jd.com/">京东超市</a>
			</li>
			<li clstag="h|keycount|2016|05g" class="fore3" >
				<a target="_blank" href="//fresh.jd.com/">生鲜</a>
			</li>
			<li clstag="h|keycount|2016|05h" class="fore4" >
				<a target="_blank" href="//www.jd.hk/">全球购</a>
			</li>
		</ul>
		<div class="spacer"></div>
		<ul id="navitems-group3">
			<li clstag="h|keycount|2016|05i" class="fore1" >
				<a target="_blank" href="//jr.jd.com/">京东金融</a>
			</li>
		</ul>
    </div>
</body>
</html>