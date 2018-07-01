<html>
	<body>
		<p>Enter The Name You Want To Attack</p>
		<input type="text" id="name" value=""/>
		<p>
			<button onclick="getName();" type="button" class="button btn">Done</button>
		</p>
		<p>Choose Attack Options</p>
	</body>
	<script type="text/javascript" src="./js/jquery-1.7.min.js"></script>
	<script type="text/javascript">
		function getName() {
			var name = $('#name').val();
			$.ajax({
				type : "post",
				url : "${pageContext.request.contextPath}/user/getName",
				timeout:30000,
				data : {
					name : name
				},
				dataType : "json",
				success : function(data) {
					alert("done")
				},
				error : function(data) {
				}
			});
		}
	</script>
</html>
