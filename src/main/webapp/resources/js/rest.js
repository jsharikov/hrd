$(document).ready(function () {
    $("#createForm").on("submit", function(e){
        e.preventDefault();
        var formTag = $('#createForm');
        var firstName = formTag.find('#firstName').val();
        var lastName = formTag.find('#lastName').val();
        var patronymic = formTag.find('#patronymic').val();
        $.ajax({
            type: 'post',
            url: 'employee/',
            data: JSON.stringify({firstName: firstName, lastName: lastName, patronymic: patronymic}),
            contentType: "application/json",
            dataType: 'json'
         });
    });

    $("#updateForm").on("submit", function(e){
        e.preventDefault();
        var formTag = $('#updateForm');
        var id = formTag.find('#id').val();
        var firstName = formTag.find('#firstName').val();
        var lastName = formTag.find('#lastName').val();
        var patronymic = formTag.find('#patronymic').val();
        $.ajax({
            type: 'put',
            url: 'employee/' + id,
            data: JSON.stringify({id: id, firstName: firstName, lastName: lastName, patronymic: patronymic}),
            contentType: "application/json",
            dataType: 'json'
        });
    });

    $('#deleteForm').on("submit", function(e) {
        e.preventDefault();
        var id = $('#deleteForm #id').val();
        $.ajax({
            type: 'delete',
            url: 'employee/' + id,
            data: JSON.stringify({id: id}),
            contentType: "application/json",
            dataType: 'json'
        });
    });
});