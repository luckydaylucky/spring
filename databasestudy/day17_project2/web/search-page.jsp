<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style type="text/css">
		.content{
			width:643px;
			margin:200px auto;
			text-align: center;
		}
		input[type='text']{
			width:530px;
			height:40px;
			font-size: 14px;
		}
		input[type='button']{
			width:100px;
			height:46px;
			background: #38f;
			border: 0;
			color: #fff;
			font-size: 15px
		}
		.show{
			position: absolute;
			width: 535px;
			border: 1px solid #999;
			border-top: 0;
			display: none;
		}
	</style>
	<script src="js/jquery-3.3.1.js"></script>
	<script type="text/javascript">
                /**
                 * 循环data:
                 * 获取每一个name值,把获取到的name设置div中
                 * element  ===>  User对象
                 *
                 */
                function fun() {
					var name = $("#name").val();
					var parm = {"name":name};
					if(name==null||""==name.trim()){
					    return;
					}
					$("#show").empty();
					$.post("Servletselect",parm,function (data) {
					    $(data).each(function (index,element) {
                                var div = $("<div>"+element.name+"</div>");
                                $("#show").append(div).show();
                        });
                    },"json");
                }



	</script>
</head>
<body>
<div class="content">
	<img alt="" src="logo.png"><br/><br/>
	<input type="text" name="word" id="name" onblur="fun()">
	<input type="button" value="搜索一下">
	<div class="show" id="show"></div>
</div>
</body>
</html>