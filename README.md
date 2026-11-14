# Análise e Otimização do Algoritmo da Sequência de Fibonacci em Java

Repositório desenvolvido para fins acadêmicos, com o objetivo de analisar o comportamento de algoritmos recursivos, identificar gargalos de desempenho e aplicar técnicas de otimização (programação dinâmica).

## 📂 Arquivos do Repositório

1. **Algoritmo Bruto:**
   - Implementa a recorrência matemática clássica da Sequência de Fibonacci de forma puramente recursiva ($F_n = F_{n-1} + F_{n-2}$).
   - **Problema:** Demonstra o gargalo de desempenho e a lentidão ao calcular entradas maiores (como $n = 40$), devido ao recálculo redundante de subproblemas.

2. **Algoritmo com Memória (Otimizado):**
   - Implementa a técnica de **memorização (cache)** utilizando um vetor (`array`) de apoio.
   - **Solução:** Salva os resultados já calculados para evitar chamadas redundantes, reduzindo drasticamente o tempo de processamento e permitindo calcular entradas grandes instantaneamente.
