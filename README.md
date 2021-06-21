## Spring-Data-JPA-Embedded-Embeddable
 * Exemplo para estudo de projections com jpa e orm

 * java 1.8 </br>
 * Spring 2.2.2.RELEASE </br>
 * banco H2 </br>
 * Lombok </br>

##  @Embeddable
 * JPA fornece a anotação @Embeddable para declarar que uma classe será incorporada por outras entidades.

##  @Embedded
 * A anotação JPA @Embedded é usada para embutir um tipo em outra entidade.


## Exemplo:
## Entidade - Aluno
Propriedades:
* nome, 
* telefone

## Embeddable - Endereco
Propriedades:
* Rua,
* Endereco,
* Complemento,
* Numero
