# Message

To be clear. The content here is a content based on a free course. Noone can reproduce this material. If you wanna to know this material, my advice is to you access the **free** [course](https://web.dio.me/track/coding-the-future-claro-java-spring-boot). And if they end the course or start to ask money to study in the course? Well, this considerations are out of my control, but the DIO material is excelent and the course is amazing! If you acquire a DIO paln, you will have access to amazing courses.  

---

Teste de interfaces. Não quero simplesmente testar o trivial. Veja os arquivos para entender o teste. Eu crio uma instância tipando-a com o tipo de uma interface.

Interessante notar a questão da visibilidade dos métodos de uma interface: se eu tento setar um método na interface como **protected**, o VSCode acusa o seguinte erro:

```
Illegal modifier for the interface method metodoDaInterface1; only public, abstract, default, static and strictfp are permittedJava(67109914)
```

Atenção:

- Na interface no método obrigatoriamente é abstrato, não pode ter implementação;
- Em uma classe pai, o método pode ter implementação;
- O método de uma interface pode ser `public, abstract, default, static`. Não pode ser `private` ou `protected`;
- Na herança, o que eu não posso é reduzir a visibilidade de um método, não posso trocar o tipo de retorno;
- Quanto aos parâmetros, na herança eu posso mudar o tipo de um parâmetro, mas ao usar interfaces não.

Veja [neste link](https://stackoverflow.com/a/7311293/8792303) a questão das propiedades nas interfaces. Elas podem existir, mas segundo o link:

```
Variables can be defined in interfaces, but they do not behave as might be expected: they are treated as final static
```

Veja que na `Interface1` eu criei uma propriedade (`public final static`).
