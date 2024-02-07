@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(

content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            <table>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>email</th>
                </tr>
                @for(var user : page.getUsers())
                    <tr>
                        <td><a href="/users/${user.getId()}">${user.getId()}</a></td>
                        <td>${user.getFirstName()} ${user.getLastName()}</td>
                        <td>${user.getEmail()}</td>
                    </tr>
                @endfor
            </table>
        </main>
    </div>
`
)
