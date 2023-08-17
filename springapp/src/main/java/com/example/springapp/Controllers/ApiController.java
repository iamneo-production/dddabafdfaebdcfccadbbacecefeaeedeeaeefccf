@RestController
@RequestMapping("api/v1/user")
public class ApiController {
    
    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome String Boot!";
    }
}