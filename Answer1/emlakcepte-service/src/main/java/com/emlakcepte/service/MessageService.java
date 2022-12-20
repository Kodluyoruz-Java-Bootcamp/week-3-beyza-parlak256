package Service;

import java.util.List;

@Service
public class MessageService {
	private MessageRepository messageDao = new MessageRepository();

		private UserService userService;

		public void createRealty(Message message) {
			if (UserType.INDIVIDUAL.equals(message.getUser().getType())) {
				System.out.println("Bireysel kullanıclar en fazla 5 mesaj gönderebilir.");
			}
			realtyDao.saveRealty(message);
			System.out.println("createRealty :: " + message.getTitle());
		}

		public List<Message> getAll() {
			return messageDao.findAll();
		}

		public void printAll(Lis<Message> messageList) {
			messageList.forEach(realty -> System.out.println(message));
		}

		public void getAllByProvince(String answer) {
			getAll().stream().filter(message -> message.getAnswer().equals(message))
					.forEach(message -> System.out.println(message));
		}

		public List<Message> getAllByUserName(User user) {
			return getAll().stream().filter(realty -> message.getUser().getMail().equals(user.getMail())).toList();
		}

		public List<Message> getActiveRealtyByUserName(User user) {
			return getAll().stream().filter(message -> message.getUser().getName().equals(user.getName()))
					.filter(message -> MessageType.ACTIVE.equals(message.getStatus())).toList();

		}
}
