@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(

content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            !{var user = page.getUser();}
            @if(user == null)
                <p>Пока не добавлено ни одного пользователя</p>
            @else
                <div>
                    <p>${user.getId()}</p>
                    <p>${user.getEmail()}</p>
                    <p>${user.getFirstName()} ${user.getLastName()}</p>
                </div>
            @endif
        </main>
    </div>
`
)
