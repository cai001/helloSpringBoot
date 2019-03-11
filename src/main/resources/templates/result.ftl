<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Использование фрейма</title>
</head>
<body>
<form method="post" action="/result">
    <p><input placeholder="Введите текст" name="text" id="text">
    <p><input type="submit" value="Отправить"></p>
</form>
<table>
    <tr>
        <th>Url</th>
        <th>Status</th>
    </tr>
    <#list urlsFromDataBase as url>
        <td>${url.url}</td>
        <td>${url.status}</td>
    </#list>
</table>
</body>
</html>