#Interface gráfica com Tkinter

from tkinter import *
from tkinter import messagebox

janela = Tk()
janela.title("Minha primeira janela")
janela.geometry("500x500+600+70")#tamanho + posição da janela da tela

#janela.minsize(200,200) #tamanho mínimo
#janela.maxsize(600,600) #tamanho máximo

#janela.resizable(False,False)#bloqueia o redirecionamento da janela

#janela.state("zoomed")#começa maximizada
#janela.state("iconic")#começa minimizada

janela['bg'] = "#FFC0CB" #mudar a cor de fundo

def mensagem1():
    #print("Clicou no botão")
    texto = txtnome.get()
    print(texto)
def mensagem2():
    messagebox.showinfo("Informação", "Mensagem de informação")

#Adiciona um Label(rótulo)
nome = Label(janela,text = "Nome", font = "Arial 20 bold", fg = "Indigo", bg = "pink")
nome.pack(pady=10)#gap

#adiciona caixa de texto
txtnome = Entry (janela, font = "Arial 20", bg = "Plum")
txtnome.pack()

#adiciona um botão
botao1 = Button(janela,text = "Clique!",bg = "white", command = mensagem1)
botao1.pack(pady=10)#gap
botao2 = Button(janela,text = "Não clique aqui!",bg = "white", command = mensagem2)
botao2.pack()





janela.mainloop()
