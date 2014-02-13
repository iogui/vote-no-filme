$(function() {
	$.ajax({
		url: 'filme/enquete.go',
		cache: false,
		success: function(data){
			$('#divConteudo').html(data);
			$.getScript('resources/js/enquete.js');
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert("deu erro [textStatus="+textStatus+";errorThrown="+errorThrown+";status="+jqXHR.status+"]");
		}
	});
});