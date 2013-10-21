package data.idao;

	import java.util.List;
	import data.dto.BilledDTO;

		public interface IOperatoerDAO {
			BilledDTO getbilledNummer(int billedNummer) throws DALException;
			List<BilledDTO> getBilledList() throws DALException;
			List<BilledDTO> getBilledList(int vareNummer) throws DALException;
			void createBilled(BilledDTO billed) throws DALException;
			void updateBilled(BilledDTO billed) throws DALException;
			}
	
	
	
}
