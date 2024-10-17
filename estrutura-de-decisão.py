#estrutura de decisão

"""
idade = int (input ("Digite uma idade: "))

if idade > 17:
    print("Pode entrar")
else:
    print ("Nâo pode entrar")

"""

#saber se um número é positivo ou negativo

"""
num = int (input ("Digite um número: "))
if num > 0:
    print ("Numero é positivo")
elif num < 0:
    print("Numero é negativo")
else:
    print ("Numero é zero")
"""

#verificar se o numero é par ou impar

"""
num = int (input ("Digite um número: "))

if num % 2 == 0:
    print ("Numero é par")
else:
    print("O numero é impar")
"""


"""
ano = int (input ("Digite um número: "))
if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print ("ano bissexto!")
else:
    print("ano não é bissexto!")
"""

#calculadora IMC

"""
peso = float (input ("Digite o seu peso: "))
altura = float (input ("Digite a sua altura: "))
imc = peso/(altura**2)

if imc < 18.5:
    print("Magreza")
elif imc >= 18.5 and imc <= 24.9:
    print("Peso ideal")
else:
    print("Sobrepeso")

"""

#operador de divisão no python

numero1 = int (input ("Digite um numero:"))
numero2 = int (input ("Digite outro numero:"))

print (numero1 / numero2)#faz a divisao normalmente
print (numero1 // numero2)#retorna apenas o numero inteiro da divisão

