import re

agenda = {}
salir = True

def insertar_contacto():
    nombre = input("Ingrese el nombre del contacto: ")
    telefono = input("Ingrese el número de teléfono: ")

    if len(telefono)>9 or len(telefono)<6:
        print("Numero de telefono erroneo, vuelva a insertar")
        telefono = input("Ingrese el número de teléfono: ")
    else:
        agenda[nombre] = telefono
        print("Contacto ", nombre, "con número" , telefono , " agregado exitosamente")

def validar_numero(telefono):
        if telefono.isdigit() and 1 <= len(telefono) <= 11:
            return True
        return False

def actualizar_contacto():
    nombre = input("Ingrese el nombre del contacto a actualizar: ")
    if nombre in agenda:
        nuevo_telefono = input("Ingrese el nuevo número de teléfono a actualizar:")
        if validar_numero(nuevo_telefono):
            agenda[nombre] = nuevo_telefono
            print("Contacto", nombre, " actualizado a " , nuevo_telefono)
        else:
            print("Número de teléfono inválido. Asegúrese de que tenga solo números y entre 1 y 11 dígitos")
    else:
        print("Contacto con nombre" , nombre , " no encontrado")

def buscar_contacto():
    nombre = input("Ingrese el nombre del contacto a buscar: ")

    if nombre in agenda:
        print("Contacto encontrado:" , nombre , "\nNúmero: " , agenda[nombre], )
    else:
        print("Contacto con nombre" , nombre ,  "no encontrado")

def eliminar_contacto():
    nombre = input("Ingrese el nombre del contacto a eliminar: ")
    if nombre in agenda:
        del agenda[nombre]
        print("Contacto" , nombre , "eliminado exitosamente")
    else:
        print("Contacto con nombre ", nombre , "no encontrado")

def listar_contactos():
    if agenda:
        print("\nLista de todos los contactos:")
        for nombre, telefono in agenda.items():
            print(nombre , ":" , telefono)
    else:
        print("No hay contactos registrados")


while(salir==True):

    print("Agenda de contactos \n","\nQue desea hacer:")
    print("1.Añadir contactos \n"
          "2.Busqueda de contactos\n"
          "3.Actualización de contactos\n"
          "4.Eliminación de contactos \n"
          "5.Listar los contactos \n"
          "6.Salir \n")

    userOption = int(input())

    match userOption:
        case 1:
            insertar_contacto()
        case 2:
            buscar_contacto()
        case 3:
            actualizar_contacto()
        case 4:
            eliminar_contacto()
        case 5:
            listar_contactos()
        case 6:
            print("Usted va a salir.")
            break

