#Comentários sobre o código

* No ProdutoController.java é recebido um VO chamado ProdutoVO.java . Tal VO contém os atributos do Produto, sendo um deles do tipo MultipartFile, referente ao arquivo de imagem;
* O ProdutoController.java passa o VO recebido para o ProdutoService.java. Nele, os dados são armazenados no banco via repository.save e, a seguir, usando o ArquivoService.java, a imagem é armazenada numa pasta. 
* No ArquivoService.java o nome do arquivo de imagem é concatenado com o id do produto que acabou de ser salvo no banco. Tal classe retorna para o ProdutoService.java o nome do arquivo armazenado.
* No ProdutoService.java, após receber o nome do arquivo armazenado, é atualizada a coluna/propriedade da Entidade que corresponde ao nome do arquivo.

#Observações
* A imagem application.properties_ecommerce contém o parâmetro com o endereço da pasta onde os arquivos de imagem serão armazenados. Inclua esse parâmetro no seu arquivo de propriedades, trocando o caminho para um endereço de seu próprio computador.
* As imagens postman_ecommerce_0 e postman_ecommerce_1 mostram como os dados são enviados através do Postman. Repare que é usado o tipo "form-data" e, para a imagem, no lugar de texto, o tipo "File".
* No front os dados deverão ser enviados através de um formulário para terem o mesmo tipo de transmissão mencionado acima, ou seja, form-data.
