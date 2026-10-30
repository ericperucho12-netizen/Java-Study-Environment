# Entregas de Alumnos

Esta carpeta está destinada a que los estudiantes suban sus ejercicios resueltos.

## Instrucciones para subir tus ejercicios

Si descargaste el repositorio completo (por ejemplo, en un archivo ZIP) y ya resolviste tus ejercicios (probablemente en la carpeta `Ejercicios_Sin_Resolver`), sigue el **Método 1**, que es el más sencillo. Si ya usas Git por consola, ve al **Método 2**.

---

### Método 1: Subir directamente desde la página web (Ideal para principiantes)
Si descargaste el ZIP, resolviste los ejercicios y ahora solo quieres subir tu carpeta:

1. En tu computadora, renombra la carpeta donde tienes tus ejercicios resueltos (ej. cambia el nombre de `Ejercicios_Sin_Resolver` a tu nombre, por ejemplo: `JuanPerez`).
2. Entra a la página de GitHub de este repositorio y navega hasta esta carpeta (`Entregas_Alumnos`).
3. Haz clic en el botón **"Add file"** (arriba a la derecha de los archivos) y selecciona **"Upload files"**.
4. Arrastra tu carpeta `JuanPerez` (con todos tus ejercicios adentro) al recuadro que aparece en pantalla.
5. Abajo, en la sección de "Commit changes", escribe un título (ej. "Entrega de Juan Perez").
6. **Nota importante:** Si no eres colaborador directo, GitHub creará automáticamente una copia (Fork) y te pedirá hacer un **Pull Request**. Solo dale al botón verde de "Propose changes" y luego a "Create pull request". ¡Y listo!

---

### Método 2: Usando Git por consola (Avanzado)

**Opción A: Tienes acceso directo al repositorio (Colaborador)**
1. **Actualiza tu repositorio local**: `git pull origin main`
2. **Crea una nueva rama**: `git checkout -b entrega-juan-perez`
3. **Crea tu carpeta personal** dentro de este directorio (`Entregas_Alumnos/JuanPerez`) y pon ahí tus ejercicios resueltos.
4. **Sube los cambios**:
   ```bash
   git add Entregas_Alumnos/JuanPerez/
   git commit -m "Entrega de ejercicios de Juan Perez"
   git push origin entrega-juan-perez
   ```
5. Abre un **Pull Request** en GitHub hacia la rama `main`.

**Opción B: No tienes acceso directo (Uso de Forks)**
1. Haz clic en **Fork** en la página del repositorio.
2. Clona tu fork: `git clone https://github.com/TU_USUARIO/TU_FORK.git`
3. Crea tu carpeta (e.g., `Entregas_Alumnos/JuanPerez`) y añade tus archivos.
4. Sube los cambios:
   ```bash
   git add .
   git commit -m "Añado mis ejercicios"
   git push origin main
   ```
5. Crea un **Pull Request** desde tu fork hacia el repositorio principal.
