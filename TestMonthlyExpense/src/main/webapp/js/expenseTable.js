/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 15/6/14
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */


$(document).ready(function () {

    $(function () {
        $("#datePicker").datepicker();
    });

    $('.menu_button').live('click', function () {
        var id = $(this).attr('id');
        if (id == "m1") {
            //do your stuff here
        }
    });

});

