#Listas e outros

"""
#Lista básica
for i in "Inconstitucionalissimamente":
    print(i)

#Lista números

numeros = [1,2,3,4,5,6]
 
for n in numeros:
    print(n)

frutas_nomes = ['Maçã','Pêra','Caju','Melão','Kiwi','Cajá']

for a in frutas_nomes:
    print(a)


#Imprimir lista com while e len
lista = [2,3,5,6,8]
x = 0
while x < len(lista):
    print(lista[x])
    x += 1

lista = [2,3,5,6,8]
lista.append(75)
print (lista)
lista.append(90)
print (lista)


#Remover elementos da lista

lista = [20,30,50,60,80]
lista.remove(30)
print (lista)

#Remover elementos pelo indice (pop)

lista = [10,20,30,40,50]
lista.pop(3)
print (lista)


#Remover elementos pelo indice (del)

lista = [10,20,30,40,50]
del lista(5)
print (lista)



#Buscar um elemento da lista

lista = [10,20,30,40,50]
p = int(input("Digite um número:"))

if p in lista:
    print("O número está na lista!")
else:
    print("O número não está na lista!")

"""


lista = [80,94,31,23,44,67,50,39,48,57,61,83,95,40,69]
chances = 10
while True:
  p = int(input("Digite um número:"))
  if p in lista:
    print("O número está na lista!")
    break
  else:
    print("O número não está na lista!")
    chances = chances - 1
  print(f"Só tem: {chances}")











































