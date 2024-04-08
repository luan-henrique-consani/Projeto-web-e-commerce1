const logar = document.querySelector("#logar");
const cadastrar = document.querySelector("#cadastrar");
const container = document.querySelector(".container");

cadastrar.addEventListener("click", () => {
    container.classList.add("cadastrar-mode");
});

logar.addEventListener("click", () => {
    container.classList.remove("cadastrar-mode");
});