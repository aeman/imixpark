<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>时尚街拍</title>
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
					<h1 class="text-center">时尚街拍</h1>
				</div>
			</section>
            <!-- 主题 -->
			<!--section.row>(h3.DRC-sheetSnap-title{主题}>img.DRC-sheetSnap-icon-menu)+ul.DRC-sheetSnap-scrollBox>li[data-type=0]>img[src=""]+span{圣诞节}-->
			<section class="row">
				<h3 class="DRC-sheetSnap-title"><img src="image/min/streetSnap_18.jpg">主题</h3>
				<div class="DRC-sheetSnap-scrollBox" id="wrapper">
					<ul>
						<li data-type="0"><img src="image/min/streetSnap_32.jpg"><span>圣诞节</span></li>
						<li data-type="2"><img src="image/min/streetSnap_34.jpg"><span>潮人</span></li>
						<li data-type="3"><img src="image/min/streetSnap_36.jpg"><span>萌宝</span></li>
						<li data-type="4"><img src="image/min/streetSnap_38.jpg"><span>潮品</span></li>
						<li data-type="5"><img src="image/min/streetSnap_40.jpg"><span>潮搭</span></li>

						<li data-type="6"><img src="image/min/streetSnap_32.jpg"><span>圣诞节</span></li>
						<li data-type="7"><img src="image/min/streetSnap_34.jpg"><span>潮人</span></li>
						<li data-type="8"><img src="image/min/streetSnap_36.jpg"><span>萌宝</span></li>
						<li data-type="9"><img src="image/min/streetSnap_38.jpg"><span>潮品</span></li>
						<li data-type="10"><img src="image/min/streetSnap_40.jpg"><span>潮搭</span></li>
					</ul>
				</div>	
			</section>
			<!-- bolg -->
			<!-- section.DRC-streetSnap-bolg>h4.row>(p.col-xs-6.text-left>img+span{Coco Xu})+p.col-xs-6.text-right>span{2015/12/10}+span{刚刚} -->
			<section class="row DRC-streetSnap-bolg">
				<h4 class="row">
					<p class="col-xs-6 text-left">
					<img class="img-circle" src="image/min/streetSnap_27.jpg" width="70" >
					<span class="D-b-name">Coco Xu</span>
					</p>
					<p class="col-xs-6 text-right D-b-time"><span>2015/12/10</span><span>刚刚</span></p>
				</h4>
				<!-- div.DRC-bolg-imgBox>img+p.DRC-bolgLable>span.DRC-icon1{H&M} -->
				<div class="DRC-bolg-imgBox">
					<p class="D-b-imgBox"><img src="image/min/streetSnap_04.jpg"  /></p>
					<p class="DRC-bolgLable">
					<span class="DRC-icon1">H&M</span>
					<span class="DRC-icon2">江北大融城</span>
					<span class="DRC-icon3">潮人</span>
					<span class="DRC-icon4">街拍</span>
				

					</p>
				</div>
				<!-- div.DRC-bolg-comment>p.text-right>span.DRC-bolg-say{1509}+span.DRC-bolg-like{1509} -->
				<div class="DRC-bolg-comment">
					<p class="text-right">
						<span class="DRC-bolg-say J_showBox">1509</span>
						<span class="DRC-bolg-like">1509</span>
					</p>
				</div>
				<!-- ul.DRC-bolg-tome>li.row>img.img-circle.iss-left+div>(p>span.D-b-title+span.D-b-time{刚刚})+p.D-b-txt -->
				 <ul class="DRC-bolg-tome">
				 	<li>
				 		<img src="image/min/streetSnap_27.jpg" class="img-circle iss-left">
				 		<div>
				 			<p class="iss-oh "><a href="javascript:;" class="D-b-title iss-left">蔡伦</a><span class="iss-right D-b-time">刚刚</span></p>
				 			<p class="rowD-b-txt">艺术决定一切</p>
				 		</div>
				 	</li>
				 	<li><a href="javascript:;" class="D-b-liLast J_showBox">显示所有评论</a></li>
				 </ul>
			</section>
		</article>
	
	<script>
		 seajs.use("./css/streetSnap.css");//页面所需css
		seajs.use(["./js/streetSnap.js"],function(DRC){
			
		  DRC.DRC_scrollBar()
		
		})
	</script>
	</body>
	
</html>