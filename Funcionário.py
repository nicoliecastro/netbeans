

import tkinter as tk
from tkinter import messagebox

# Criando a janela principal
root = tk.Tk()
root.title("Cadastro Funcionário [Davy,Grazielli e Nicolie]")
root.geometry("445x440")
root.resizable(False, False)
#root.minsize(400,400)
#root.maxsize (700,700)
root ['bg'] = "MediumTurquoise"

# Adicionando título
titulo = tk.Label(root,text="FUNCIONÁRIO", font="Arial 20 bold", bg = "MediumTurquoise",fg = "black")
titulo.grid(row=0,column =0, columnspan=5,pady=10)


def salvar_dados():   
    nome = campo1.get()
    sobrenome = campo2.get()
    cpf = campo3.get()
    cargo = campo4.get()  
     # Verificar se todos os campos foram preenchidos
    if not nome or not sobrenome or not cpf or not cargo: 
        messagebox.showerror("Erro!", "Todos os campos devem ser preenchidos.")
    else:
        messagebox.showinfo("Informação","Cadastro realizado com sucesso!")    


def atualizar_dados():
    nome = campo1.get()
    sobrenome = campo2.get()
    cpf = campo3.get()
    cargo = campo4.get()
    messagebox.showinfo("Informação","Cadastro Atualizado com sucesso!")


def exibir():
    nome = campo1.get()
    sobrenome = campo2.get()
    cpf = campo3.get()
    cargo = campo4.get()
    print("\n\n")
    print("Nome:",nome)
    print("Sobrenome:",sobrenome)
    print("Cpf:",cpf)
    print("Cargo:",cargo)
    limpar_campos()
    

def excluir_dados():
    messagebox.showinfo("Informação","Cadastro excluído com sucesso!")
    limpar_campos()


def limpar_campos():
    campo1.delete(0, tk.END)
    campo2.delete(0, tk.END)
    campo3.delete(0, tk.END)
    campo4.delete(0, tk.END)


# Definindo o layout dos campos
campo1 = tk.Label(root, text="Nome", font ="bold", fg="black", bg = "MediumTurquoise")
campo1.grid(row=1, column=2, padx=10, pady=5, sticky="e")
campo1 = tk.Entry(root)
campo1.grid(row=1, column=3, padx=10, pady=5)

campo2 = tk.Label(root, text="Sobrenome", font ="bold", fg="black", bg = "MediumTurquoise")
campo2.grid(row=2, column=2, padx=10, pady=5, sticky="e")
campo2 = tk.Entry(root)
campo2.grid(row=2, column=3, padx=10, pady=5)

campo3 = tk.Label(root, text="CPF", font ="bold", fg="black", bg = "MediumTurquoise")
campo3.grid(row=3, column=2, padx=10, pady=5, sticky="e")
campo3 = tk.Entry(root)
campo3.grid(row=3, column=3, padx=10, pady=5)

campo4 = tk.Label(root, text="Cargo", font ="bold", fg="black", bg = "MediumTurquoise")
campo4.grid(row=4, column=2, padx=10, pady=5, sticky="e")
campo4 = tk.Entry(root)
campo4.grid(row=4, column=3, padx=10, pady=5)



# Botões de ação
botao_salvar = tk.Button(root, text="Salvar", font ="bold", command=salvar_dados, bg = "DarkCyan", fg = "white")
botao_salvar.grid(row=7, column=1, padx=10, pady=30)

botao_atualizar = tk.Button(root, text="Atualizar", font ="bold", command=atualizar_dados, bg = "DarkCyan", fg = "white")
botao_atualizar.grid(row=7, column=2, padx=10, pady=30)

botao_excluir = tk.Button(root, text="Excluir", font ="bold", command=excluir_dados, bg = "DarkCyan", fg = "white")
botao_excluir.grid(row=7, column=3, padx=10, pady=30)

botao_pesquisar = tk.Button(root, text="Pesquisar", font ="bold", command=exibir, bg = "DarkCyan", fg = "white")
botao_pesquisar.grid(row=7, column=4, padx=10, pady=30)
# Iniciar a interface
root.mainloop()


