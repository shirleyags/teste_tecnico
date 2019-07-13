const btEnviar = document.querySelector('#enviar-dados');
btEnviar.addEventListener('click',function(event){
    event.preventDefault();

    const form = document.querySelector("#form-adiciona");
    const coluna = form.colunas.value;
    const linha = form.linhas.value;

    const corpoTabela = document.querySelector('table');

    
    for (let i=0; i < linha; i++){
        const criarTr = document.createElement('tr');
        corpoTabela.appendChild(criarTr);
        for(let j=0; j < coluna; j++){
            const criarTd = document.createElement('td');
            criarTr.appendChild(criarTd);
        }
    }
    
    form.reset();
    
});




