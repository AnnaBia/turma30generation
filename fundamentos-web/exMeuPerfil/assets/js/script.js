/*
Linguagem Case Sentitive = reconhece letras maiusculas e minusculas
    por Tag: getElementByTagNome()
    por Id: getElelmentById()
    por Nome: getElementByName()
    por Classe: getElementsByClassName()
    por Seletor: querySelector()

    no caso de usar atraves da querySeletor, se for pelo id, o parametro deve possuir' #', no caso classe o parametro deve possuir '.'
    style é o meu css
    */
// VARIÁVEIS
let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%' // altera o tamanho do campo
email.style.width = '100%'

function validaNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nome.value.length < 3){ // se o tamanho do valor nome for < 3
        txtNome.innerHTML = 'Nome Inválido' // colocar um valor dentro da di
        txtNome.style.color = 'red' 
        // alert('nome inválido') // alert é alerta que vai aparecer no site
    } else{
        txtNome.innerHTML = 'Nome Válido'
        txtNome.style.color = 'green'
        let nomeOk = true
    }
}

function validaEmail(){
    let txtEmail = document.querySelector('#txtEmail')
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){ // se dentro do valor email não tiver @ ou o ponto final
        txtEmail.innerHTML = 'E-mail inválido'
        txtEmail.style.color = 'red'
    } else{
        txtEmail.innerHTML = 'E-mail Válido'
        txtEmail.style.color = 'green'
        let emailOk = true
    }
}

function validaAssunto(){
    let txtAssunto = document.querySelector('#txtAssunto')

    if(assunto.value.length >= 100){
        txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
    } else{
        txtAssunto.style.display = 'none'
        let assuntoOk = true
    }
}

function enviar(){
    if(nomeOk == true && emailOk == true && assuntoOk == true){
        alert('Formulário enviado com sucesso!')
    }else{
        alert('Preencha o formulário corretamente antes de enviar ...')
    }
}

function mapaZoom(){
    mapa.style.width = '800px'
    mapa.style.height = '600px'

}

function mapaNormal(){
    mapa.style.width = '450px'
    mapa.style.height = '250px'
}
