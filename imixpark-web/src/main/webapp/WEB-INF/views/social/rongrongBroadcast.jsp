<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>荣荣播报</title>
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
					<h1 class="text-center">融融播报</h1>
				</div>
			</section>
			<!-- section.DRC-streetSnap-bolg>h4.row>(p.col-xs-6.text-left>img+span{Coco Xu})+p.col-xs-6.text-right>span{2015/12/10}+span{刚刚} -->
			<section class="DRC-streetSnap-bolg iss-mgT0 DRC-border-top">
				<h4 class="row">
					<p class="col-xs-6 text-left iss-mgL0"><img class="img-circle DRC-border" src="image/min/rongronginfo_11.jpg" width="70"><span class="D-b-name">融融播报</span></p>
					<p class="col-xs-6 text-right D-b-time iss-mgR0"><span>5分钟前</span></p>
				</h4>
			</section>
			
			<section class="DRC-streetSnap-bolg DRC-rongrongBox">
				<div class="iss-padH20">
					<p class="DRC-rongrong-title">快报！快报！吾皇驾到，快来参拜～白茶王子也将会一同现身哦！</p>
					<img src="image/min/rongronginfo_05.jpg" alt="" class="DRC-rongrong-txt" />				
					<p class="DRC-rongrong-txt">
						江北大融城年终酬宾，全场8折起，折后购物满1000元送400元提货单，提货单全馆通用（特殊品类除外）国 际一线品……物满1000元送2000积分……购物满额再赠八重大礼。江北大融城欢迎您的光临。江北大融城年终酬宾，全场8折起，折后购物满1000元送400元提货单，提货单全馆通用（特殊品类除外）国 际一线品……物满1000元送2000积分……购物满额再赠八重大礼。江北大融城欢迎您的光临。江北大融城年终酬宾，全场8折起，折后购物满1000元送400元提货单，提货单全馆通用（特殊品类除外）国 际一线品……物满1000元送2000积分……购物满额再赠八重大礼。江北大融城欢迎您的光临。江北大融城年终酬宾，全场8折起，折后购物满1000元送400元提货单，提货单全馆通用（特殊品类除外）国 际一线品……
					</p>
				</div>
				<div class="DRC-bolg-imgBox">
					<p class="DRC-bolgLable">
					<span class="DRC-icon2">江北大融城</span>
					<span class="DRC-icon4">咨询</span>
					</p>
				</div>
				
				
			</section>
			<section class="DRC-streetSnap-bolg iss-mgT0">
					<div class="DRC-bolg-comment">
					<p class="text-right">
						<span class="DRC-bolg-say J_showBox">1509</span>
						<span class="DRC-bolg-like-hot">1509</span>
						<span class="DRC-bolg-shar">1509</span>
					</p>
				</div>
				<ul class="DRC-bolg-tome">
				 	<li>
				 		<img src="image/min/streetSnap_27.jpg" class="img-circle iss-left">
				 		<div class="iss-oh ">
				 			
				 			<p class="D-b-title iss-left">
				 				<a href="javascript:;" >蔡伦</a><span>回复</span><a href="javascript:;">CC</a>
				 			</p>
				 			<P class="iss-right D-b-time"><span>刚刚</span></p>
				 			<p class="rowD-b-txt">艺术决定一切</p>
				 		</div>
				 	</li>
				 	<li><a href="javascript:;" class="D-b-liLast J_showBox">显示所有评论</a></li>
				 </ul>
				</section>

		</article>

	<script>
		seajs.use(["./css/rongrongBroadcast.css"]);//页面所需css类似streetSnap
		seajs.use(["./js/streetSnap.js","./js/rongrongBroadcast.js"],function(select){
			//蓉蓉播报页面公用js
		  
		
		})
	</script>
	</body>
	
</html>