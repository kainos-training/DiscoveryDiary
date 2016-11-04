
<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<h1>${media.title}</h1>

<table class="table">
    <thead>
        <th>Title</th>
        <th>Author</th>
        <th>Description</th>
        <th>Category</th>
        <th>Publication Date</th>
    </thead>

    <tbody>
            <tr>
            <td>
                ${media.title}
            </td>
            <td>
                ${media.author}
            </td>
            <td>
                ${media.description}
            </td>
            <td>
                ${media.category}
            </td>
            <td>
                ${media.publicationDate}
            </td>
            </tr>

    </tbody>
</table>

</@layoutTemplate.layout>