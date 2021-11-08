
$(() => {
    $("#frmCreateCustomer").validate({
        onkeyup: function(element) {$(element).valid()},
        onclick: false,
        rules: {
            fullName: {
                required: true,
                minlength: 5,
                maxlength: 50
            },
            indentity: {
                required: true,
                minlength: 10,
                maxlength: 10,
                number: true
            },
            email: {
                email: true,
                number: true,
                maxlength: 20,

            },
            password: {
                required: false,
                // validatePassword: true,
                minlength: 5
            },
            rePassword: {
                // equalTo: "#password",
                minlength: 5
            }
        },
        messages: {
            fullName: {
                required: "Bắt buộc nhập tên đầy đủ",
                minlength: "Hãy nhập tối thiểu 5 ký tự",
                maxlength: "Hãy nhập tối đa 50 ký tự"
            },
            indentity: {
                required: "Bắt buộc nhập đầy đủ Số CCCD",
                minlength: "nhập thiểu 10 kí tự",
                maxlength: "độ dài 10 kí tự",
                number: "bắt buộc nhập số"
            },
            password: {
                required: "Bắt buộc nhập mật khẩu",
                minlength: "Hãy nhập ít nhất 5 ký tự"
            },
            rePassword: {
                equalTo: "Hai mật khẩu phải giống nhau",
                minlength: "Hãy nhập ít nhất 5 ký tự"
            }
        },
        submitHandler: function() {
            createCustomer();
        }
    });

    $("#frmUpdateCustomer").validate({
        onkeyup: function(element) {$(element).valid()},
        onclick: false,
        rules: {
            upFullName: {
                required: true,
                minlength: 5,
                maxlength: 50
            }
        },
        messages: {
            upFullName: {
                required: "Bắt buộc nhập tên đầy đủ",
                minlength: "Hãy nhập tối thiểu 5 ký tự",
                maxlength: "Hãy nhập tối đa 50 ký tự"
            }
        },
        submitHandler: function() {
            updateCustomer();
        }
    });

    $.validator.addMethod("validatePassword", function (value, element) {
        return this.optional(element) || /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}$/i.test(value);
    }, "Hãy nhập mật khẩu từ 5 đến 16 ký tự bao gồm chữ hoa, chữ thường và ít nhất một chữ số");
});