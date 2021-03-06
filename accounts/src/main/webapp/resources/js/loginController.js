function setUserData()
{
    $.ajax({
        type: "POST",
        data: {"name": $("input[name*='name']").val(),
            "surname": $("input[name*='surname']").val(),
            "userID": $("input[name*='userID']").val()},
        url: "/login",
        dataType: 'json',
        success : function(json) {
            var isUnique = json.isUnique;

            console.log(json.isUnique);

            if (isUnique === false) {
                $("input[name*='userID']").show();
                $("#textID").show();
            } else {
                $("#setData").hide();
                $("span[name*='textProfile']").show();
                $("#toProfile").show();
                $("#incorrectData").show();
            }
        }
    });
}

function refresh() {
    $("#setData").show();
    $("span[name*='textProfile']").hide();
    $("#toProfile").hide();
    $("#incorrectData").hide();
}
