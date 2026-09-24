---
description: Analisa a resolução de um exercício de Java do livro "Java: Como Programar" — compara a implementação com o enunciado e propõe correções. Use quando alguém pedir revisão de um exercício (ex.: "/exercicio 4.17" ou "/exercicio ch04/exercises/4.18/creditLimit.java").
---

Analise a resolução do exercício de Java: $ARGUMENTS

## Como localizar o arquivo

1. Se o argumento for um caminho (ex.: `ch04/exercises/4.18/creditLimit.java`), use-o diretamente.
2. Se for um número de exercício (ex.: `4.18`), procure em `ch{XX}/exercises/{X.Y}/` — onde `XX` é o capítulo com dois dígitos e `{X.Y}` é o número do exercício. Use glob para achar o arquivo dentro da pasta (ex.: `ch04/exercises/4.18/*.java`).
3. Se nada for encontrado, informe que não achou a pasta do exercício e pergunte o caminho. Não invente.

## Procedimento

1. **Leia o comentário do topo do arquivo.** Ele normalmente contém o enunciado do exercício e pode conter pseudocódigo. Leia o código completo do arquivo.
2. **Compare a implementação com o enunciado, item a item.** Verifique com atenção:
   - Cálculos e fórmulas: estão corretos? Compare os valores constantes com o enunciado com exatidão (ex.: 350.89 virou 350.90?). Confira se a variável certa entra em cada operação (ex.: usar `hoursWorked` onde deveria ser `hoursWorked`, e não uma constante).
   - Acumuladores e inicializações: começam no valor certo? Somam com `+=` ou sobrescrevem?
   - Repetição e sentinela: o loop termina quando deve? O valor lido como sentinela é o do enunciado?
   - Condições: os limites estão corretos (ex.: `> 40` vs `>= 40`)? Todos os casos do enunciado são cobertos (menos de 40h, exatamente 40h, mais de 40h)?
   - Tipos: divisão de inteiros que deveria ser ponto flutuante? Cast necessário?
   - Saída: tudo o que o enunciado pede para exibir é exibido? Mensagens exatas, quando o enunciado as define? Moeda e idioma condizentes?
   - Se houver pseudocódigo no topo: o código segue o que ele descreve? (Sem transformar isso no foco — prioridade é o enunciado.)
3. **Compile e execute sempre que possível** para validar. Compile para `/tmp` (ex.: `javac -d /tmp/opencode/exercicio <arquivo>`) e rode com entradas de teste via stdin. Cubra casos-limite: valores no limite (40h), valores acima/abaixo, itens inválidos, sentinela, divisão por zero. Aponte quando o comportamento real diverge do esperado, com números.
4. **Reporte** nesta ordem:
   - O que está correto (curto).
   - Cada divergência com **linha e trecho exatos** do arquivo.
   - O impacto de cada uma: quebra o resultado? Falta saída pedida? É só apresentação? Não edite o arquivo ainda — apenas proponha.
   - A correção ou complemento sugerido, com o código exato de substituição.
   - Se não houver divergências, diga explicitamente que a resolução atende ao enunciado.
5. **Edite apenas se o usuário confirmar.** A análise vem primeiro.

## Estilo da resposta

- Responda em português do Brasil.
- Honestidade: se o programa não compila ou um teste falha, diga — não maquie com "quase lá".
- Separe o que é erro funcional (corrigir) do que é melhoria opcional (sugerir).