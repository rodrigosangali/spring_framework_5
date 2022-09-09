package sangali.com.publisher_jpa.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sangali.com.publisher_jpa.domain.Client;
import sangali.com.publisher_jpa.repositories.ClientRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final ClientRepository clientRepository;

    public BootStrap(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Client eric = new Client("Eric", "Avenida Bussocaba 850", "Osasco", "São Paulo", 6036080L);
        clientRepository.save(eric);

        System.out.println("Number of clients: " + clientRepository.count());




    }
}
