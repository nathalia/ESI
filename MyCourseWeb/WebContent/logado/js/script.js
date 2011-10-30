$(document).ready(function() {
   var day=['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'],
	   month=['January','February','March','April','May','June','July','August','September','October','Novermber','December'];
   SetData();
   function SetData() {
	   var now = new Date();
	   $('.data').html(day[now.getDay()]+', ');
	   $('.data').append(' '+month[now.getMonth()]+' ');
	   $('.data').append(now.getDate()+', ');
	   $('.data').append(now.getFullYear()+' ');
	   hour=now.getHours();
	   minutes=now.getMinutes();
	   if (minutes<10) {minutes='0'+minutes};
	   $('.data').append(hour+':'+minutes);
	}
  	setInterval(SetData,60);
 });
