$(document).ready(function(){

    $('#mostrar').on('click',function(){
        alert("entro alv")
        tabla=document.querySelector('#tabla')
        tabla.innerHTML=""
        $.ajax({
            url:"http://localhost:8080/verlista",
            type:"GET",
            dataType:"JSON",
            success: function(res){
                for(let i = 0; i<=res.length; i++){
                    tabla.innerHTML+= '<tr><td>'+
                    res[i].cod + '</td><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].categoria +'</td><td>'+
                    res[i].precio +'</td><td>'+
                    res[i].cantidad + '</td><td>'+
                    res[i].total+'</td><td>'+
                    res[i].totalIva+'</td></tr>'
                    console.log(tabla.innerHTML)
                }
            }
        });
    });

    $('#categoria').on('click',function(){
        let dato= $("#validationServer01").val()
        console.log("dato"+dato)
        ubi=document.querySelector('#tabla1')
        $.ajax({
            url:"http://localhost:8080/categoria/"+dato,
            type:"GET",
            dataType:"JSON",
            success: function(res){
                for(let j = 0; j<=res.length; j++){
                    ubi.innerHTML+= '<tr><td>'+
                    res[j].cod + '</td><td>'+
                    res[j].nombre + '</td><td>'+
                    res[j].categoria +'</td><td>'+
                    res[j].precio +'</td><td>'+
                    res[j].cantidad + '</td><td>'+
                    res[j].total+'</td><td>'+
                    res[j].totalIva+'</td></tr>'
                }
            }
        });
    });
});