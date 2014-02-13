$('#btnSubmeterEnquete').click(function(event) {
	var idSelecionada = $('#tblEnquete input[type=radio][name=filme]:checked').val();
	alert('TODO: Implementar aqui com id='+ idSelecionada);
});

$('#tblEnquete img').click(function(event) {
	$(this).parent().children('input[type=radio][name=filme]').prop("checked", true);
});