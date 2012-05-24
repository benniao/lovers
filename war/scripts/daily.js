$(function() {
	var $dailyList = $("#daily-list");
	$dailyList.delegate(".daily-title", "click", function() {
		$dailyList.find(".daily-item").removeClass("content").addClass("summary");
		var $parent = $(this).parent();
		$parent.removeClass("summary").addClass("content");
	});
});