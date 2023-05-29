<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<script>
	$(document).ready(function() {

		$("#id").change(function() {

			$.ajax({

				url : 'validateEmail',
				data : {
					id : $("#id").value()
				},
				success : function(responseText) {

				}
			});
		});

	});
</script>

</head>
<body>

	<form action="registerUser" method="post">
		<pre>
Id: <input type="text" name="id" id="id" />
Name: <input type="text" name="name" />
Email: <input type="text" name="email" />
		 </pre>
		<input type="submit" name="register" />
	</form>

	<br /> ${result}
</body>
</html>