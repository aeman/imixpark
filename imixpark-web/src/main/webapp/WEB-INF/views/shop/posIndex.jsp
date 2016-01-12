<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商户主页</title>
		<meta name="viewport" content="width=750, user-scalable=no" />
		<!--页面JS start-->
		<!--包含bootstrap、underscore、jquery2.1.4-->
		<link type="text/css" rel="stylesheet" href="js/bower_components/bootstrap/dist/css/bootstrap.css" />
		<link rel="stylesheet" href="css/all.css" />
		<script src="js/min/all.js"></script>
		<script src="js/bower_components/seajs/dist/sea.js" id="seajsnode"></script>
		<script src="js/bower_components/seajs-css/dist/seajs-css.js"></script>
		<!--页面JS end-->
	</head>
	<body>

		<article class="container">
			<section class="row DRC-search-box iss-oh">
				<div class="iss-left">
					<p class="DRC-menu-left"><a class="block" href="index.html"></a></p>
				</div>
				<div class="DRC-search-input">
					<h1 class="text-center">商户主页</h1>
				</div>
			</section>
			<section class="DRC-pos-head">
				<p class="iss-left pos-left">
					<img class="img-circle" src="image/min/pos_09.jpg">
				</p>
				<div class="pos-right">
					<h3>巴贝拉</h3>
					<p class="pos-title2">是一家创立于上海的全国连锁意式西餐厅</p>
						<ul class="pos-list">
							<li><img src="image/min/pos_25.jpg"  /><span>营业时间：11:00-22:00</span></li>
							<li><img src="image/min/pos_39.jpg"  /><span>地址：江北大融城广场1F 101</span><a href="javascript:;" class="DRC-right iss-right"></a></li>
							<li><img src="image/min/pos_53.jpg"  /><span>电话：6225454</span><a href="javascript:;" class="DRC-right iss-right"></a></li>
						</ul>
					
				</div>
			</section>
			<section class="DRC-pos-conpon">
				<h3 class="text-center">
					<p class="pos-conpon">优惠券</p>
					<p class="conpon-more">更多<samp class="glyphicon glyphicon-triangle-right"></samp></p>
				</h3>
				<div class="conpon-box">
					<ul class="conpon-ul">
						<li>
							<img class="iss-left" src="../image/min/pos_07.jpg" width="224" height="160"  />
							<div class="conpon-right">
								<!--h4{韩国海鲜部队火锅}+p{代金券一张}+(p.iss-left>big{59}+small{元/份}+del{100元})+p.iss-right.conpon-getit>span{立即领取}+span{剩余4份}-->
								<h4>韩国海鲜部队火锅</h4>
								<p class="conpon-title2">代金券一张</p>
								<p class="iss-left">
									<big>59</big>
									<small>元/份</small>
									<del>100元</del>
								</p>
								<p class="iss-right conpon-getit"><span>立即领取</span><span>剩余4份</span></p>
							</div>
						</li>
						<li>
							<img class="iss-left" src="../image/min/pos_07.jpg" width="224" height="160"  />
							<div class="conpon-right">
								<!--h4{韩国海鲜部队火锅}+p{代金券一张}+(p.iss-left>big{59}+small{元/份}+del{100元})+p.iss-right.conpon-getit>span{立即领取}+span{剩余4份}-->
								<h4>韩国海鲜部队火锅</h4>
								<p class="conpon-title2">代金券一张</p>
								<p class="iss-left">
									<big>59</big>
									<small>元/份</small>
									<del>100元</del>
								</p>
								<p class="iss-right conpon-getit"><span>立即领取</span><span>剩余4份</span></p>
							</div>
						</li>
					</ul>
				</div>
			</section>
			
		    下面内容是蓉蓉播报的内容请自己添加模块
		

		

		</article>

	<script>
		seajs.use(["./css/posIndex.css"]);//页面所需css类似streetSnap
		/*seajs.use(["./js/streetSnap.js","./js/rongrongBroadcast.js"],function(select){
			//蓉蓉播报页面公用js
		  
		
		})*/
	</script>
	</body>
	
</html>