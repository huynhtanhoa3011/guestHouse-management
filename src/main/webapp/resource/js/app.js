class App {

    static DOMAIN = location.origin;

    static BASE_URL_CUSTOMER = "http://localhost:8080/api/customers";
    static BASE_URL_PROVINCE = "http://localhost:8080/api/provinces";
    // static RESOURCE_API = "https://provinces.open-api.vn/api/"
    static RESOURCE_API = "https://vapi.vnappmob.com/api/province";

    static ERROR_400 = "Giao dịch không thành công, vui lòng kiểm tra lại dữ liệu";
    static ERROR_404 = "An error occurred. Please try again later!";
    static SUCCESS_CREATED = "Successful data generation !";
    static SUCCESS_UPDATED = "Data update successful !";
    static SUCCESS_SUSPEND = "Succeeded client suspension !";

    static showSuspendedConfirmDialog() {
        return Swal.fire({
            icon: 'warning',
            text: 'Are you sure to suspend the selected customer ?',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes, please suspend this client !',
            cancelButtonText: 'Cancel',
        })
    }

    static showSuccessAlert(t) {
        Swal.fire({
            icon: 'success',
            title: t,
            position: 'top-end',
            showConfirmButton: false,
            timer: 1500
        })
    }

    static showErrorAlert(t) {
        Swal.fire({
            icon: 'error',
            title: 'Warning',
            text: t,
        })
    }

    static formatNumber() {
        $(".num-space").number(true, 0, ',', ' ');
        $(".num-point").number(true, 0, ',', '.');
        $(".num-comma").number(true, 0, ',', ',');
    }

    static formatNumberSpace(x) {
        return x.toString().replace(/ /g, "").replace(/\B(?=(\d{3})+(?!\d))/g, " ");
    }

    static removeFormatNumberSpace(x) {
        return x.toString().replace(/ /g, "")
    }

    static formatTooltip() {
        $('[data-toggle="tooltip"]').tooltip();
    }
}


class Customer {
    constructor(id, fullName, indentity, gender,  phone, province_name, district, ward, timeCheckin) {
        this.id = id;
        this.fullName = fullName;
        this.indentity = indentity;
        this.gender = gender;
        this.phone = phone;
        this.province_name = province_name;
        this.district = district;
        this.ward = ward;
        this.timeCheckin = timeCheckin;
    }
}





