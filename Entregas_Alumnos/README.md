# Entregas de Alumnos

Esta carpeta está destinada a que los estudiantes suban sus ejercicios resueltos.

## Instrucciones para subir tus ejercicios

Para mantener el orden en el repositorio, sigue estos pasos para subir tus trabajos:

### Opción 1: Tienes acceso directo al repositorio (Colaborador)
1. **Actualiza tu repositorio local**: Asegúrate de tener la última versión del código.
   ```bash
   git pull origin main
   ```
2. **Crea una nueva rama** con tu nombre o número de matrícula:
   ```bash
   git checkout -b entrega-juan-perez
   ```
3. **Crea tu carpeta personal** dentro de este directorio (`Entregas_Alumnos`). Debería quedar algo como: `Entregas_Alumnos/JuanPerez`.
4. Añade los archivos de tus ejercicios resueltos dentro de tu carpeta.
5. **Añade los cambios y haz un commit**:
   ```bash
   git add Entregas_Alumnos/JuanPerez/
   git commit -m "Entrega de ejercicios de Juan Perez"
   ```
6. **Sube tu rama** a GitHub:
   ```bash
   git push origin entrega-juan-perez
   ```
7. Ve a GitHub y abre un **Pull Request (PR)** desde tu rama hacia la rama `main` para que el profesor pueda revisar y aprobar tus ejercicios.

---

### Opción 2: No tienes acceso directo (Uso de Forks)
Si no te han dado permisos de colaborador en el repositorio:
1. En la página del repositorio en GitHub, haz clic en el botón **Fork** (arriba a la derecha).
2. Clona **tu fork** en tu computadora:
   ```bash
   git clone https://github.com/TU_USUARIO/TU_FORK.git
   ```
3. Crea tu carpeta (e.g., `Entregas_Alumnos/JuanPerez`) y añade tus archivos.
4. Sube los cambios a tu repositorio:
   ```bash
   git add .
   git commit -m "Añado mis ejercicios"
   git push origin main
   ```
5. Ve al repositorio original en GitHub, haz clic en la pestaña **Pull Requests** y crea un **New Pull Request** comparando tu fork con el repositorio principal.
