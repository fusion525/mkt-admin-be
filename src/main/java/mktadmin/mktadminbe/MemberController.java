package mktadmin.mktadminbe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<MemberDTO> listAllMembers() {
        return memberService.listAllMembers();
    }

    @GetMapping("/{id}")
    public MemberDTO getMemberById(@PathVariable("id") long id) {
        return memberService.findMemberById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MemberDTO createMember(@Valid @RequestBody CreateMemberCommand command) {
        return memberService.createMember(command);
    }
}
