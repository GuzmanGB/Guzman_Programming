const taskInput = document.getElementById('tareaInput');
const taskList = document.getElementById('taskList');
const taskForm = document.getElementById('task-form');
const deleteAllTasksButton = document.getElementById('deleteAllTasks');
const deleteCompletedTasksButton = document.getElementById('deleteCompletedTasks');
const showAllButton = document.getElementById('showAll');
const showActiveButton = document.getElementById('showActive');
const showCompletedButton = document.getElementById('showCompleted');

function addTask(event) {
    event.preventDefault();

    if (taskInput.value.trim() === "") return;

    const taskDiv = document.createElement('div');
    taskDiv.classList.add('task');

    const taskText = document.createElement('p');
    taskText.textContent = taskInput.value;
    taskDiv.appendChild(taskText);

    const checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    taskDiv.appendChild(checkbox);

    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'Eliminar';
    taskDiv.appendChild(deleteButton);

    taskList.appendChild(taskDiv);

    taskInput.value = '';

    checkbox.addEventListener('change', () => {
        if (checkbox.checked) {
            taskText.style.textDecoration = 'line-through';
        } else {
            taskText.style.textDecoration = 'none';
        }
    });

    deleteButton.addEventListener('click', () => {
        taskList.removeChild(taskDiv);
    });
}

deleteAllTasksButton.addEventListener('click', () => {
    taskList.innerHTML = ''; 
});

deleteCompletedTasksButton.addEventListener('click', () => {
    const completedTasks = taskList.querySelectorAll('.task input:checked');
    completedTasks.forEach(task => {
        task.parentElement.remove();
    });
});

showAllButton.addEventListener('click', () => {
    const tasks = taskList.querySelectorAll('.task');
    tasks.forEach(task => task.style.display = 'block');
});

showActiveButton.addEventListener('click', () => {
    const tasks = taskList.querySelectorAll('.task');
    tasks.forEach(task => {
        if (task.querySelector('input').checked) {
            task.style.display = 'none';
        } else {
            task.style.display = 'block';
        }
    });
});

showCompletedButton.addEventListener('click', () => {
    const tasks = taskList.querySelectorAll('.task');
    tasks.forEach(task => {
        if (!task.querySelector('input').checked) {
            task.style.display = 'none';
        } else {
            task.style.display = 'block';
        }
    });
});

taskForm.addEventListener('submit', addTask);
