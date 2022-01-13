let index = {
	init: function() {
		$("#btnRgtr").on("click", () => {	// this를 바인딩하기 위해 화살표 함수 사용
			this.register();
		});
	},
	
	register: function() {
		let data = {	// Javascipt Object
			name: $("#name").val(),
			email: $("#email").val()
		}
		
		$.ajax({
			type: "POST",
			url: "/user",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(res){
			alert("회원가입이 완료되었습니다.");
			location.href="/";
		}).fail(function(err){
			alert(JSON.stringify(err));
		});
	}
}
index.init();