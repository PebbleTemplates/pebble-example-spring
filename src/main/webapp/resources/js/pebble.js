$(document).ready(function(){
	
	// code highlighting
	$('pre').each(function(index, element) {
		hljs.highlightBlock(element);
	});
});