<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>找店</title>
		<meta name="viewport" content="width=750, user-scalable=no" />
		<!--页面JS start-->
		<!--包含bootstrap、underscore、jquery2.1.4-->
		<link type="text/css" rel="stylesheet" href="js/bower_components/bootstrap/dist/css/bootstrap.css" />
		<link rel="stylesheet" href="css/all.css" />
		<script src="js/min/all.js"></script>
		<script src="js/bower_components/seajs/dist/sea.js" id="seajsnode"></script>
		
		<!--页面JS end-->
	</head>
	<body>

		<article class="container">
			<section class="row DRC-search-box iss-oh">
				<div class="iss-left">
					<p class="DRC-menu-left"><a class="block" href="index.html"></a></p>
				</div>
				<div class="DRC-search-input">
					<p><input type="text" class="DRC-menu-search iss-placeholder" value="请输入店名、品牌名"  /><span class="DRC-menu-searchBTN"></span></p>
				</div>
			</section>
		    <!-- 排序 -->
			<!-- section.row.DRC-List-box>(div.J_Event_Select.col-xs-4{楼层}>span.glyphicon glyphicon-menu-down)*3 -->
			<section class="row DRC-List-box">
				<div class="col-xs-4 text-center J_Event_Select" id="floor">楼层<span class="glyphicon glyphicon-menu-down"></span></div>
				<div class="col-xs-4 text-center J_Event_Select" id="suit">服装服饰<span class="glyphicon glyphicon-menu-down"></span></div>
				<div class="col-xs-4 text-center J_Event_Select" id="sort">排序<span class="glyphicon glyphicon-menu-down"></span></div>
			</section>
			<section class="row">		
				<ul class="DRC-List-source" id="DRC-List-source"><!-- 列表注入 --></ul>
			</section>
				<!--section.row>ul.DRC-List-source-in -->
			<section class="row">
				<ul class="DRC-List-source-in">
			<!-- li>a[href="#"]>img.img-circle[src="image/min/findShoplist_18.jpg"]+span{adidas Originals} -->
					<li>
						<a href="#">
							<img src="image/min/findShoplist_18.jpg" alt="" class="img-circle">				
							<span>adidas Originals</span>
						</a>
					</li>
					<li>
						<a href="#">
							<img src="image/min/findShoplist_18.jpg" alt="" class="img-circle">				
							<span>必胜客</span>
						</a>
					</li>
				</ul>
			</section>		
		</article>
		<!--页面所需控件-->
	<script src="js/default.js"></script>
	<script>
		seajs.use(["./js/findSHop_public.js"],function(select){
			//找店页面公用js
		   /*
		   	id:"对应页面id",
		   	data:[{txt:'需要显示内容',id:'排序id',src:"点击后的回掉ajax地址"}]     ajax回掉的json 
		    */
			select.DRC_SELECT({id:"floor",data:[{txt:"B1层",id:0,src:"#"},{txt:"F1层",id:1,src:"#"},{txt:"F2层",id:2,src:"#"},{txt:"F3层",id:3,src:"#"}]})
				  .DRC_SELECT({id:"suit",data:[{txt:"服装服饰",id:0,src:"#"},{txt:"餐饮美食",id:1,src:"#"},{txt:"休闲娱乐",id:2,src:"#"},{txt:"母婴亲子",id:3,src:"#"},{txt:"魅妆丽人",id:4,src:"#"},{txt:"数码家居",id:3,src:"#"},{txt:"生活便利",id:3,src:"#"},{txt:"教育亲子",id:3,src:"#"}]})
				  .DRC_SELECT({id:"sort",data:[{txt:"默认",id:0,src:"#"},{txt:"名称a~z",id:1,src:"#"},{txt:"名称z~a",id:2,src:"#"}]});
		})
	</script>
	</body>
	
</html>
