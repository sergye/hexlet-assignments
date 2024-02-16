@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(

content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            <table>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>body</th>
                </tr>
                @for(var post : page.getPosts())
                    <tr>
                        <td><a href="/posts/${post.getId()}">${post.getId()}</a></td>
                        <td>${post.getName()}</td>
                        <td>${post.getBody()}</td>
                    </tr>
                @endfor
            </table>
        </main>
    </div>

    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li class="page-item">
                <a class="page-link" href="/posts?page=${page.getPageNumber() - 1}" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li class="page-item">
                <a class="page-link" href="/posts?page=${page.getPageNumber() + 1}" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
`
)
