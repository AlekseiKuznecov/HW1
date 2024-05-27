document.addEventListener("DOMContentLoaded", function () {
    let categories = document.querySelector(".categories");
    let categoriesForm = document.querySelector(".categories-form");

    categories.addEventListener("click", function () {
        categoriesForm.classList.toggle("show");
    });
});

document.addEventListener("DOMContentLoaded", function () {
    let categoriesLink = document.querySelector(".deleteBut");
    categoriesLink.addEventListener("click", function (event) {
        event.preventDefault();
        displayCategories(categories);
            })

    function displayCategories(categories) {
        let notificationForm = document.querySelector(".categories-form");
        let categoriesFormContent = document.querySelector("#categoryFormContent");

        categoriesFormContent.innerHTML = "";

        categories.forEach(function (category) {
            let categoryElement = createDeleteNotification(category);
            categoriesFormContent.appendChild(categoryElement);
        });

        notificationForm.classList.add("show");

        let categoryFormContainer = document.getElementById("categoryFormContainer");
        categoryFormContainer.style.display = "block";

        let closeButton = document.querySelector("#categoryFormCloseBtn");
        closeButton.addEventListener("click", function () {
            categoryFormContainer.style.display = "none";
        });
    }

    function createDeleteNotification(deleteButton) {
        let deleteNotification = document.createElement("label");
        deleteNotification.className = "button-delete";

        let notification = document.createElement("h1");
        notification.className = "category";
        notification.value = "Пользоватеь успешно удален!";
        notification.addEventListener('change', handleCheckboxChange);

        deleteNotification.appendChild(notification);
        return deleteNotification;
        }
    });


