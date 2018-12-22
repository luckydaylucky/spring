<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="js/jquery-3.3.1.js"></script>
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
	<script type="text/javascript" src="jquery-3.3.1.js"></script>
	<script type="text/javascript">
		function searchWord(t){
		    var word = $(t).val();
		    var param = {"word":word};
		   $.post("QueryUserServlet2",param,function(data){
		       var conment = "";
              $(data).each(function(index,element){
                  conment += element.username+"<br/>";
                  $("#show").html("<div style='text-align: left;background-color: red' onclick='ck(element.username)'>"+conment+"</div>").show();
              })
           },"json")
		}

        function hidediv(){
		    $("#show").hide();
        }

        function ck(v){
		    alert(v);
		    $("input[name='word']").val(v);
        }
	</script>
</head>
<body>
<div class="content">
	<img alt="" src="logo.png"><br/><br/>
	<input type="text" name="word" onkeyup="searchWord(this)" onblur="hidediv()">
	<input type="button" value="搜索一下">
	<div class="show" id="show"></div>
</div>
</body>
</html>