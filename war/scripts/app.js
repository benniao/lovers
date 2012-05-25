$(function() {
	var $roundDiv = $("#round-div");

	$roundDiv.delegate("a", "click", function() {
		if ($roundDiv.attr("class")) {
			$roundDiv.attr("class", "");
		} else {
			$roundDiv.attr("class", $(this).attr("id"));
		}
		return true;
	}).delegate("p", "click", function() {
		$roundDiv.attr("class", "");
	});
});