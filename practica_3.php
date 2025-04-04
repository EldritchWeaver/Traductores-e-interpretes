$cuerpo = @{ 
             "phone"=$telefono
             "message"=$mensaje
             "key"="textbelt"
$envio.content
$envio = invoke-webrequest -uri https://textbelt.com/text -body $cuerpo -method post
$telefono = read-host "indicame el numero de telefono sin espacios ni guiones iniciando con el signo + y el codigo del pais:"
write-output ""
$mensaje = read-host "indicame el mensaje del destinatario :"
write-output ""

read-host "presione cualquier tecla para salir"
}
