$(document).ready(function(){

    $('#mostrar').on('click',function(){
        tabla=document.querySelector('#tabla')
        tabla.innerHTML="";
        $.ajax({
            url:"http://localhost:8080/verlista",
            type:"GET",
            dataType:"JSON",
            success: function(res){
                console.log(res)
                for(let i = 0; i<=res.length; i++){
                    tabla.innerHTML+= '<tr><td>'+
                    res[i].cod + '</td><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].categoria +'</td><td>'+
                    res[i].precio +'</td><td>'+
                    res[i].cantidad + '</td><td>'+
                    res[i].total+'</td><td>'+
                    res[i].totalIva+'</td></tr>'
                
                }
            }
        });
    });

    $('#categoria').on('click',function(){
        ubi=document.querySelector('#tabla1')
        ubi.innerHTML=""
        let dato= $("#validationServer01").val()
        console.log("dato"+dato)
        $.ajax({
            url:"http://localhost:8080/categoria/"+dato,
            type:"GET",
            dataType:"JSON",
            success: function(res){
                console.log(res)
                for(let i=0; i<= res.length; i++){
                    ubi.innerHTML+= '<tr><td>'+
                    res[i].cod + '</td><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].categoria +'</td><td>'+
                    res[i].precio +'</td><td>'+
                    res[i].cantidad + '</td><td>'+
                    res[i].total+'</td><td>'+
                    res[i].totalIva+'</td></tr>'
                }
            }
        });
    });
    $('#mostrarTotal').on('click',function(){
        ubi=document.querySelector('#tabla2')
        ubi.innerHTML=""
        $.ajax({
            url:"http://localhost:8080/totales",
            type:"GET",
            dataType:"JSON",
            success: function(res){
                console.log(res)
                for(let i=0; i<= res.length; i++){
                    ubi.innerHTML+= '<tr><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].precio + '</td><td>'+
                    res[i].cantidad + '</td><td>'+
                    res[i].total +'</td><td>'+
                    res[i].totalIva +'</td></tr>'
                }
            }
        });
    });
});