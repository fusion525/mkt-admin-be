package mktadmin.mktadminbe;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

    private ModelMapper modelMapper;
    private MembersRepository repository;

    public MemberService(ModelMapper modelMapper, MembersRepository repository) {
        this.modelMapper = modelMapper;
        this.repository = repository;
    }

    public List<MemberDTO> listAllMembers() {
        return repository.findAll().stream().map(member -> modelMapper.map(member, MemberDTO.class))
                .collect(Collectors.toList());
    }

    public MemberDTO findMemberById(long id) {
        return modelMapper.map(repository.findById(id).orElseThrow(() -> new NotFoundByIdException("Member not found by id: " + id)), MemberDTO.class);
    }

    public MemberDTO createMember(CreateMemberCommand command) {
        Member member = new Member(
                command.getFirstName() + " " +command.getLastName(),command.getLastName(), command.getFirstName(),
                command.getEmail(), command.getPhoneNumber(), command.getZip(), command.getCity(),command.getAddress(),
                command.getBirthDate(), command.getBirthplace(),command.getMemberState());

        repository.save(member);
        return modelMapper.map(member,MemberDTO.class);
    }
}
