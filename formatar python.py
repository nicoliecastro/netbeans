
#Saida de dados formatada com Python

nome = input("Insira seu nome:")
idade = int (input("Insira sua idade:"))
peso =  float (input ("Insira seu peso:"))

#antiga
print ("%s tem %d de idade %.1f peso" %(nome,idade,peso))

#forma mais nova
print ("{} tem {} anos e {:.2f} peso".format(nome, idade,peso))

#forma novissima
print (f"{nome} tem {idade} anos e {peso:.2f} peso")


